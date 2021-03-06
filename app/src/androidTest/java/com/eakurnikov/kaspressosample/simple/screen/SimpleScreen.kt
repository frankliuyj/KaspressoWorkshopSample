package com.eakurnikov.kaspressosample.simple.screen

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.eakurnikov.kaspressosample.R
import com.eakurnikov.kaspressosample.simple.matchers.ClassNameMatcher

/**
 * Created by eakurnikov on 2019-12-18
 */
object SimpleScreen : Screen<SimpleScreen>() {

    val title = KTextView { withId(R.id.tv_simple_title) }

    val editText = KEditText { withId(R.id.et_simple) }

    val btnDelete = KButton { withId(R.id.btn_simple_delete) }

    val btnNext = KButton {
        isDescendantOfA {
            withId(R.id.simple_root)
        }
        withSibling {
            withText(R.string.delete)
        }
        withBackgroundColor(R.color.colorPrimary)
    }
}