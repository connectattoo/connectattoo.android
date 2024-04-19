package br.com.connectattoo.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserSearchViewModel : ViewModel() {

    private val imagesTattooUserSearch: MutableLiveData<List<String>> = MutableLiveData(
        listOf(
        "https://drive.google.com/file/d/1F0RM_zMj3fIbnjthBPO-pRSCy4O98K0B/view?usp=sharing",
        "https://drive.google.com/file/d/16gcXf-g_4E_Udvi2ndL2RCnwcUKejRnU/view?usp=sharing",
        "https://drive.google.com/file/d/1anhvRM-Lsp4eDc5vcnRNbDb63V-YNEAu/view?usp=drive_link",
        "https://drive.google.com/file/d/1saEKxCERLN-Hk5JJC9kGjrmaHtU9Ihca/view?usp=drive_link",
        "https://drive.google.com/file/d/1wHXfaRGmR2MlmVQLJIS1uv2XJZvkbWKj/view?usp=drive_link",
        "https://drive.google.com/file/d/17ww-HjdlSxt9klFZDEmp2sLtLX7HDXjI/view?usp=drive_link",
        "https://drive.google.com/file/d/1WsJ3XtmTcHf0a6s4ZC_dsQx2rdMBnb-B/view?usp=drive_link",
        "https://drive.google.com/file/d/1DIMd87zNY4PlyJP9KpyFXPVDjCEIntwZ/view?usp=drive_link",
        "https://drive.google.com/file/d/1FfTJnX_9UYnqJnWo76u2-bPya8gzlfA2/view?usp=drive_link",
        "https://drive.google.com/file/d/1boUUplgEuUuyDvLuZf-szhG19hOGUc2l/view?usp=drive_link",
        "https://drive.google.com/file/d/1zR6ynSJBod0thCyytnTUWIE8YIDwm3eY/view?usp=drive_link",
        "https://drive.google.com/file/d/1sEmmdBe2CfQziTmrSz0mVkcp85SfBIyz/view?usp=drive_link"
    ))

    val _imagesTattooUserSearch: LiveData<List<String>> = imagesTattooUserSearch

}
