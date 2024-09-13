package com.example.sidelinesweetheart.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.sidelinesweetheart.R
import com.example.sidelinesweetheart.ui.theme.SidelineSweetheartTheme

@Composable
fun HomePane(
    teamOne: String,
    teamTwo: String,
    teamOneScore: String,
    teamTwoScore: String,
    modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Live Scores")
        Image(painter = painterResource(R.mipmap.nfl), contentDescription = "nfl logo")
        ScoreCard(teamOne = "Team One", teamTwo = "Team Two", teamOneScore = "100", teamTwoScore = "100")
    }
}

@Composable
fun ScoreCard(teamOne: String, teamTwo: String, teamOneScore: String, teamTwoScore: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Score Card")
        Row(modifier = modifier) {
            Column{
                Text(text = teamOne)
                Text(text = teamOneScore)
            }
            Column{
                Text(text = teamOne)
                Text(text = teamTwoScore)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePanePreview() {
    SidelineSweetheartTheme {
        HomePane()
    }
}