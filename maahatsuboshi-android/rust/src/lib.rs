//! Platform-independent task primitives; device transport is implemented in a later phase.
#[derive(Debug, Clone, PartialEq, Eq)]
pub enum TaskState { Pending, Running, Paused, Completed, Failed }
#[derive(Debug, Clone, PartialEq, Eq)]
pub struct Task { pub id: String, pub state: TaskState }
impl Task {
    pub fn new(id: impl Into<String>) -> Self { Self { id: id.into(), state: TaskState::Pending } }
    pub fn start(&mut self) -> Result<(), &'static str> {
        if self.state != TaskState::Pending && self.state != TaskState::Paused { return Err("task is not startable"); }
        self.state = TaskState::Running; Ok(())
    }
    pub fn pause(&mut self) -> Result<(), &'static str> {
        if self.state != TaskState::Running { return Err("only running tasks can be paused"); }
        self.state = TaskState::Paused; Ok(())
    }
}
#[cfg(test)]
mod tests {
    use super::*;
    #[test] fn task_can_start_and_pause() {
        let mut task = Task::new("daily"); task.start().unwrap(); task.pause().unwrap();
        assert_eq!(task.state, TaskState::Paused);
    }
    #[test] fn completed_task_cannot_restart() {
        let mut task = Task::new("contest"); task.state = TaskState::Completed;
        assert_eq!(task.start(), Err("task is not startable"));
    }
}
