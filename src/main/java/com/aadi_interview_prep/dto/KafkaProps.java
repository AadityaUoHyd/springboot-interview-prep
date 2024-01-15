package com.aadi_interview_prep.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KafkaProps {

    private String bootStrapServers;
    private int port;
    private String topicName;
}
