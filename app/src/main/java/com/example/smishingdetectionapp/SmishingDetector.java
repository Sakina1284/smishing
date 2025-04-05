package com.example.smishingdetectionapp;

import java.util.Arrays;
import java.util.List;

public class SmishingDetector {
    /*private static final List<String> SMISHING_KEYWORDS = Arrays.asList(
            "win", "congratulations", "free", "claim", "urgent", "click", "prize", "won", "gift", "cash"
    );

     */
    private static final List<String> SMISHING_KEYWORDS = Arrays.asList(
            "win", "congratulations", "free", "claim", "urgent", "click", "prize", "won", "gift", "cash",
            "suspended", "verify", "account", "delivery", "login", "parcel", "reschedule", "address", "update"
    );

    public static boolean isSmishingMessage(String message) {
        for (String keyword : SMISHING_KEYWORDS) {
            if (message.contains(keyword)) {
                return true;
            }
        }
        return false;
    }
}
