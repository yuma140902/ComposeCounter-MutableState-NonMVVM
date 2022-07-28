package yuma140902.android.composecounter_mutablestate_nonmvvm.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainView() {
    val (state, setState) = remember {
        mutableStateOf(MainModel(counter = 0))
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = state.counter.toString())
        Button(onClick = { setState(state.copy(counter = state.counter + 1)) }) {
            Text(text = "Count Up")
        }
        Button(onClick = { setState(state.copy(counter = 0)) }) {
            Text(text = "Reset")
        }
    }
}