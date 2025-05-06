package br.senai.sp.jandira.projetoprofile.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelaCadastro() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(390.dp),
                shape = RoundedCornerShape(
                    0.dp, 0.dp, 32.dp, 32.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Magenta
                )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxSize(),
                        painter = painterResource(id = br.senai.sp.jandira.projetoprofile.R.drawable.background),
                        contentDescription = "",
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            stringResource(br.senai.sp.jandira.projetoprofile.R.string.details_name),
                            color = Color.White,
                            fontSize = 23.sp,
                            modifier = Modifier
                                .padding(35.dp)
                        )
                        Card(
                            modifier = Modifier
                                .size(100.dp),
                            shape = CircleShape,
                            border = BorderStroke(
                                width = 2.dp,
                                brush = Brush.horizontalGradient(
                                    listOf(
                                        Color(color = 0xFF1E1C1C),
                                        Color.Red
                                    )
                                )
                            ),
                            elevation = CardDefaults
                                .cardElevation(2.dp)
                        ) {
                            Image(
                                painter = painterResource(br.senai.sp.jandira.projetoprofile.R.drawable.usuario),
                                contentDescription = ""
                            )
                        }
                        Text(
                            text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.nome_1),
                            color = Color.White,
                            fontSize = 24.sp,
                            modifier = Modifier
                                .padding(15.dp)
                        )
                        Text(
                            text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.profissao),
                            color = Color(0xFFE1DFDF),
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 2.dp)
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 15.dp, vertical = 15.dp),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            Card(
                                modifier = Modifier
                                    .height(70.dp)
                                    .size(80.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(color = 0x85FFFFFF)
                                )
                            ) {
                                Column (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        modifier = Modifier
                                            .size(20.dp),
                                        imageVector = Icons.Default.Email,
                                        contentDescription = "",
                                        tint = Color(color = 0xFFFFFFFF)
                                    )
                                    Text(
                                        text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.email_icon),
                                        color = Color.White,
                                        fontSize = 15.sp,
                                        modifier = Modifier
                                            .padding(4.dp)
                                    )
                                }
                            }
                            Card(
                                modifier = Modifier
                                    .height(70.dp)
                                    .size(80.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(color = 0x85FFFFFF)
                                )
                            ) {
                                Column (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                            verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        modifier = Modifier
                                            .size(20.dp),
                                        imageVector = Icons.Default.Call,
                                        contentDescription = "",
                                        tint = Color(color = 0xFFFFFFFF)
                                    )
                                    Text(
                                        text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.telefone_icon),
                                        color = Color.White,
                                        fontSize = 15.sp,
                                        modifier = Modifier
                                            .padding(4.dp)
                                    )
                                }
                            }
                            Card(
                                modifier = Modifier
                                    .height(70.dp)
                                    .size(80.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(color = 0x85FFFFFF)
                                )
                            ){
                                Column (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        modifier = Modifier
                                            .size(20.dp),
                                        imageVector = Icons.Default.DateRange,
                                        contentDescription = "",
                                        tint = Color(color = 0xFFFFFFFF)
                                    )
                                    Text(
                                        text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.whats_icon),
                                        color = Color.White,
                                        fontSize = 15.sp,
                                        modifier = Modifier
                                            .padding(4.dp)
                                    )
                                }
                            }
                            Card(
                                modifier = Modifier
                                    .height(70.dp)
                                    .size(80.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(color = 0x85FFFFFF)
                                )
                            ){
                                Column (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        modifier = Modifier
                                            .size(20.dp),
                                        imageVector = Icons.Default.FavoriteBorder,
                                        contentDescription = "",
                                        tint = Color(color = 0xFFFFFFFF)
                                    )
                                    Text(
                                        text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.estrela_icon),
                                        color = Color.White,
                                        fontSize = 15.sp,
                                        modifier = Modifier
                                            .padding(4.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaCadastroPreview() {
    TelaCadastro()
}