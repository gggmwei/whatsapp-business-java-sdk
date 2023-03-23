package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * The type List reply.
 *
 * @param description The description of the selected row.
 * @param id          The unique identifier (ID) of the selected row.
 * @param title       The title of the selected row.
 */
@Data
public class ListReply{

        @JsonProperty("description")
        String description;

        @JsonProperty("id")
        String id;

        @JsonProperty("title")
        String title;
}