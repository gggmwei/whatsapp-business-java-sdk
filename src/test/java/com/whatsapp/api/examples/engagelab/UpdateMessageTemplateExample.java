package com.whatsapp.api.examples.engagelab;

import com.whatsapp.api.WhatsappApiFactory;
import com.whatsapp.api.domain.response.Response;
import com.whatsapp.api.domain.templates.*;
import com.whatsapp.api.domain.templates.type.ButtonType;
import com.whatsapp.api.domain.templates.type.Category;
import com.whatsapp.api.domain.templates.type.HeaderFormat;
import com.whatsapp.api.domain.templates.type.LanguageType;
import com.whatsapp.api.impl.WhatsappBusinessManagementApi;
import com.whatsapp.api.impl.WhatsappEngagelabApi;

import static com.whatsapp.api.TestConstants.*;
import static com.whatsapp.api.TestConstants.ENGAGELAB_DEV_SECRET;

public class UpdateMessageTemplateExample {

    public static void main(String[] args) {
        WhatsappApiFactory factory = WhatsappApiFactory.newInstance();

        WhatsappEngagelabApi whatsappEngagelabApi = factory.newEngagelabApi(ENGAGELAB_DEV_KEY, ENGAGELAB_DEV_SECRET);

        MessageTemplate template = new MessageTemplate();

        template.setName("test")
                .setCategory(Category.OTP)
                .setLanguage(LanguageType.AR)
                .addComponent(new HeaderComponent()
                        .setText("Wellcome title")
                        .setFormat(HeaderFormat.TEXT))
                .addComponent(new BodyComponent()
                        .setText("Hello {{1}}, welcome to our {{2}} test. ")
                        .setExample(new Example()//
                                .addBodyTextExamples("Mr. José", "satisfaction")
                        ))//
                .addComponent(new FooterComponent()
                        .setText("Edit template\"")
                        )
                .addComponent(new ButtonComponent()
                        .addButton(new QuickReplyButton("回复"))
                )
        ;
        Response response = whatsappEngagelabApi.updateMessageTemplate( "543212167937369", template);
        System.out.println(response);
    }

}
