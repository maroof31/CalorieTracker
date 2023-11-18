package com.seamless.onboarding_presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.seamless.core.domain.model.Gender
import com.seamless.core_ui.LocalSpacing
import com.seamless.onboarding_presentation.R

@Composable
fun SelectableButtonWithIcon(
    text: String,
    isSelected: Boolean,
    color: Color,
    selectedTextColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.button,
    Icon : Painter,
) {
    Box(
       contentAlignment = Alignment.Center,
       modifier = modifier
           .clip(RoundedCornerShape(20.dp))
           .border(
               width = 2.dp,
               color = color,
               shape = RoundedCornerShape(20.dp)
           )
           .background(
               color = if (isSelected) color else Color.Transparent,
               shape = RoundedCornerShape(20.dp)
           )
           .clickable {
               onClick()
           }
           .padding(LocalSpacing.current.spaceMedium)
    ) {
       Row(verticalAlignment = Alignment.CenterVertically) {
           Icon(painter = painterResource(id = R.drawable.baseline_male_24), tint =if (isSelected) selectedTextColor else color ,
               contentDescription = "icon")
           Spacer(modifier = Modifier.padding(4.dp))
           Text(
               text = text,
               style = textStyle,
               color = if (isSelected) selectedTextColor else color,
           )
       }
    }
}

@Composable
@Preview
fun selectableTextPreview(){
//    SelectableButtonWithIcon(
//        text = stringResource(id = com.seamless.core.R.string.female),
//        isSelected = false,
//        color = MaterialTheme.colors.primaryVariant,
//        selectedTextColor = Color.Black,
//        onClick = {
//
//        },
//        textStyle = MaterialTheme.typography.button.copy(
//            fontWeight = FontWeight.Normal),
//        Icon = painterResource(id = com.seamless.core.R.drawable.baseline_female_24)
//    )

}