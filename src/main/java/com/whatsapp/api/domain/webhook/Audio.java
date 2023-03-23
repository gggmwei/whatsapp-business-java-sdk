package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * The type Audio.
 */
@Data
public class Audio{

        @JsonProperty("mime_type") String mimeType;

        @JsonProperty("sha256") String sha256;

        @JsonProperty("id") String id;

        @JsonProperty("voice") boolean voice;

}
