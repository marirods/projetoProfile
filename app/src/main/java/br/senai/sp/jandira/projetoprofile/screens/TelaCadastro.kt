package br.senai.sp.jandira.projetoprofile.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelaCadastro() {
    Column() {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
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
                                    .padding(horizontal = 15.dp, vertical = 20.dp),
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
                                    Column(
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
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
                                    Column(
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
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
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
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
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Icon(
                                            modifier = Modifier
                                                .size(20.dp),
                                            imageVector = Icons.Default.Star,
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
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Top
                ) {
                        Row(
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .padding(top= 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                modifier = Modifier
                                    .size(25.dp),
                                imageVector = Icons.Default.Email,
                                contentDescription = "",
                                tint = Color(color = 0xFFE80909)
                            )
                            Text(
                                text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.email_text),
                                color = Color(color = 0xFF494343),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(start = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .padding(horizontal = 30.dp)
                                .padding(top = 10.dp)
                                .padding(bottom = 15.dp)
                        ) {
                            Text(
                                text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.official_text),
                                color = Color.LightGray,
                                fontSize = 11.sp,
                                fontFamily = FontFamily.SansSerif
                            )
                            Text(
                                text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.official_email),
                                color = Color.Black,
                                fontSize = 13.sp,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                            Text(
                                text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.personal_text),
                                color = Color.LightGray,
                                fontSize = 11.sp,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(top = 15.dp)
                            )
                            Text(
                                text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.personal_email),
                                color = Color.Black,
                                fontSize = 13.sp,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                        HorizontalDivider(
                            modifier = Modifier
                                .padding(
                                    top = 5.dp,
                                    start = 20.dp,
                                    end = 20.dp
                                )
                        )
                        Row(
                            modifier = Modifier
                                .padding(horizontal = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                modifier = Modifier
                                    .size(25.dp),
                                imageVector = Icons.Default.Call,
                                contentDescription = "",
                                tint = Color(color = 0xFFE80909)
                            )
                            Text(
                                text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.telephone_number),
                                color = Color(color = 0xFF494343),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(start = 8.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .padding(horizontal = 30.dp)
                                .padding(top = 10.dp)
                                .padding(bottom = 15.dp)
                        ) {
                            Text(
                                text = stringResource(
                                    br.senai.sp.jandira.projetoprofile.R.string.mobile_phone
                                ),
                                color = Color.Black,
                                fontSize = 13.sp,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                        HorizontalDivider(
                            modifier = Modifier
                                .padding(
                                    top = 10.dp,
                                    start = 20.dp,
                                    end = 20.dp
                                )
                        )
                        Row(
                            modifier = Modifier
                                .padding(horizontal = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                modifier = Modifier
                                    .size(25.dp),
                                imageVector = Icons.Default.Person,
                                contentDescription = "",
                                tint = Color(color = 0xFFE80909)
                            )
                            Text(
                                text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.team_text),
                                color = Color(color = 0xFF494343),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(start = 10.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 23.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.team_t),
                                color = Color.Black,
                                fontSize = 16.sp,

                            )
                            Spacer(modifier = Modifier.weight(1f))
                            Button(
                                onClick = { },
                                contentPadding = PaddingValues(0.dp),
                                modifier = Modifier.size(36.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFE80909)
                                )
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.ArrowForward,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                            }
                        }
                        HorizontalDivider(
                            modifier = Modifier
                                .padding(
                                    top = 10.dp,
                                    start = 20.dp,
                                    end = 20.dp
                                ),
                            color = Color(0x3CA6A5A3)
                        )
                        Row(
                            modifier = Modifier
                                .padding(horizontal = 10.dp)
                                .padding(15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = " ",
                                tint = Color(0xFFE80909),
                                modifier = Modifier.size(22.dp)
                            )
                            Text(
                                text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.text_by),
                                fontSize = 18.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 8.dp),
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 23.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.leads_segundo),
                                color = Color.Black,
                                fontSize = 16.sp,

                            )
                            Spacer(modifier = Modifier.weight(1f))
                            Button(
                                onClick = { },
                                contentPadding = PaddingValues(0.dp),
                                modifier = Modifier.size(36.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFE80909)
                                )
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.ArrowForward,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                            }
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 14.dp),
                            verticalArrangement = Arrangement.Bottom,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Button(
                                    onClick = { },
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color.White,
                                        contentColor = Color(0xFFEC829B)
                                    ),
                                    border = BorderStroke(
                                        1.dp,
                                        Color(0xFFBDBDBD)
                                    )
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.AddCircle,
                                        contentDescription = " ",
                                        tint = Color(0xFFE80909),
                                        modifier = Modifier.size(22.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = stringResource(br.senai.sp.jandira.projetoprofile.R.string.add),
                                        color = Color.Black,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                                Spacer(modifier = Modifier.width(16.dp))
                                Button(
                                    onClick = { },
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color.White,
                                        contentColor = Color(0xFF1F1F1F)
                                    ),
                                    border = BorderStroke(1.dp, Color(0xFFBDBDBD)),
                                    contentPadding = PaddingValues(8.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Share,
                                        contentDescription = "",
                                        tint = Color(0xFFE80909),
                                        modifier = Modifier.size(20.dp)
                                    )
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