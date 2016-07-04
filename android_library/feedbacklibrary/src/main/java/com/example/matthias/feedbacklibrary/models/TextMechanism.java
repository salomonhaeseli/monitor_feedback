package com.example.matthias.feedbacklibrary.models;

import android.widget.EditText;
import android.widget.TextView;

import com.example.matthias.feedbacklibrary.R;

import java.io.Serializable;

/**
 * Text mechanism model
 */
public class TextMechanism extends Mechanism implements Serializable {
    private static final String TEXT_TYPE = "TEXT_TYPE";

    private String title;
    private String hint;
    private int maxLength;

    private String inputText;

    public TextMechanism(FeedbackConfigurationItem item) {
        super(TEXT_TYPE, item);
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
