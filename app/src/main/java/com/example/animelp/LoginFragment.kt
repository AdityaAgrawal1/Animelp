package com.example.animelp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.fragment.findNavController
import com.example.animelp.ui.theme.Brown700


/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return ComposeView(requireContext()).apply {
            setContent {
                RootLayout()
                Text(text = "Hello world.")
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun RootLayout(){
        Column(
            modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo"
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text(
                    text = "Animelp",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.DarkGray
                )
                Spacer(modifier = Modifier.size(32.dp))
                Row {
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        backgroundColor = Color.White
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_sim_card),
                                contentDescription = "Logo",
                                modifier = Modifier.size(84.dp),
                                colorFilter = ColorFilter.tint(Brown700)
                            )
                            Text(
                                text = "8578888870",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray
                            )
                            Text(
                                text = "Airtel",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black
                            )
                        }
                    }
                    Spacer(modifier = Modifier.size(20.dp))
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        backgroundColor = Color.White
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_sim_card),
                                contentDescription = "Logo",
                                modifier = Modifier.size(84.dp),
                                colorFilter = ColorFilter.tint(Brown700)
                            )
                            Text(
                                text = "8578888870",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray
                            )
                            Text(
                                text = "Airtel",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black
                            )
                        }
                    }

                }
            }

        }

    }

    companion object {

        @JvmStatic
        fun newInstance() =
            LoginFragment()
    }
}
