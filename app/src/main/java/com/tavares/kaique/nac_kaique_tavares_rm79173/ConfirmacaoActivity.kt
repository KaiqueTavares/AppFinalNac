package com.tavares.kaique.nac_kaique_tavares_rm79173

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_confirmacao.*

class ConfirmacaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacao)

        val torcedor = intent.getParcelableExtra<Torcedor>("torcedor")

        tvMensagem.text= getString(R.string.mensagem_agradecimento,
                torcedor.nomeTorcedor,
                torcedor.time)
    }
}
