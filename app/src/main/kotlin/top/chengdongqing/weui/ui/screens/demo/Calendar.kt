package top.chengdongqing.weui.ui.screens.demo

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import top.chengdongqing.weui.ui.components.button.ButtonType
import top.chengdongqing.weui.ui.components.button.WeButton
import top.chengdongqing.weui.ui.components.calendar.WeCalendar
import top.chengdongqing.weui.ui.components.calendar.rememberCalendarState
import top.chengdongqing.weui.ui.components.screen.WeScreen
import top.chengdongqing.weui.ui.theme.WeUITheme

@Composable
fun CalendarScreen() {
    WeScreen(title = "Calendar", description = "日历", padding = PaddingValues(0.dp)) {
        val calendarState = rememberCalendarState()

        WeCalendar(calendarState)
        Spacer(modifier = Modifier.height(20.dp))
        WeButton(text = "回到今天", type = ButtonType.PLAIN) {
            calendarState.toToday()
        }
    }
}

@Preview
@Composable
private fun PreviewCalendar() {
    WeUITheme {
        CalendarScreen()
    }
}