#include <jni.h>
extern "C" JNIEXPORT jstring JNICALL
Java_com_game6789y_maahatsuboshi_MainActivityKt_nativeEngineVersion(JNIEnv* env, jclass) {
    return env->NewStringUTF("C++ JNI foundation 0.1.0");
}
