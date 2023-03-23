package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Referral.
 */
public class Referral{

    @JsonProperty("video_url") String videoUrl;

    @JsonProperty("media_type") String mediaType;

    @JsonProperty("image_url") String imageUrl;

    @JsonProperty("source_type") String sourceType;

    @JsonProperty("source_id") String sourceId;

    @JsonProperty("body") String body;

    @JsonProperty("thumbnail_url") String thumbnailUrl;

    @JsonProperty("headline") String headline;

    @JsonProperty("source_url") String sourceUrl;
}