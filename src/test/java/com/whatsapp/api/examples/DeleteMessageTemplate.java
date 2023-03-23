package com.whatsapp.api.examples;

import com.whatsapp.api.WhatsappApiFactory;
import com.whatsapp.api.impl.WhatsappBusinessManagementApi;

import static com.whatsapp.api.TestConstants.TOKEN;
import static com.whatsapp.api.TestConstants.WABA_ID;

public class DeleteMessageTemplate {

    public static void main(String[] args) {
        WhatsappApiFactory factory = WhatsappApiFactory.newInstance();

        WhatsappBusinessManagementApi whatsappBusinessCloudApi = factory.newBusinessManagementApi(TOKEN);


        whatsappBusinessCloudApi.deleteMessageTemplate(WABA_ID, "welcome_template");
    }
}
