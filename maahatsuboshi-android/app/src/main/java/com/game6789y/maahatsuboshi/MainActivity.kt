package com.game6789y.maahatsuboshi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        System.loadLibrary("maahatsuboshi")
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { Dashboard() } } }
    }
}

@Composable
private fun Dashboard() {
    var host by remember { mutableStateOf("") }
    var port by remember { mutableStateOf("5555") }
    var pairingPort by remember { mutableStateOf("") }
    var pairingCode by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("Not connected") }
    Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(20.dp), verticalArrangement = Arrangement.spacedBy(14.dp)) {
        Text("MaaHatsuboshiTA", style = MaterialTheme.typography.headlineMedium)
        Text("Android controller · Native engine foundation")
        Card(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Remote Android device", style = MaterialTheme.typography.titleMedium)
                OutlinedTextField(host, { host = it }, Modifier.fillMaxWidth(), label = { Text("Device IP address") }, singleLine = true)
                OutlinedTextField(port, { port = it.filter(Char::isDigit).take(5) }, Modifier.fillMaxWidth(), label = { Text("ADB connect port") }, singleLine = true)
                OutlinedTextField(pairingPort, { pairingPort = it.filter(Char::isDigit).take(5) }, Modifier.fillMaxWidth(), label = { Text("Wireless debugging pairing port") }, singleLine = true)
                OutlinedTextField(pairingCode, { pairingCode = it.filter(Char::isDigit).take(6) }, Modifier.fillMaxWidth(), label = { Text("6-digit pairing code") }, singleLine = true)
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(onClick = { status = "ADB transport is not implemented in this foundation build." }) { Text("Connect") }
                    OutlinedButton(onClick = { status = "Disconnected" }) { Text("Disconnect") }
                }
                Text("Status: $status")
            }
        }
        Card(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                Text("Automation tasks", style = MaterialTheme.typography.titleMedium)
                Text("Daily · Contest · New-account workflow")
                Text("Execution remains disabled until ADB transport and image recognition are implemented.")
            }
        }
        Card(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                Text("Native engine", style = MaterialTheme.typography.titleMedium)
                Text(nativeEngineVersion())
                Text("Rust task-core scaffold is included in the repository; not yet linked into the APK.")
            }
        }
        Text("Pairing and remote control are not active in this development build.", style = MaterialTheme.typography.bodySmall)
    }
}

private external fun nativeEngineVersion(): String
