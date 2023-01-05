package com.tasteZip.infra.modules.dto;

public record ChatDto(
        int chatSeq,
        int chatDelNy,
        int cuMember,
        String chatCreateDate,
        int ifmmSeq,
        String ifmmId,
        String path,
        String uuidName,
        String shValue
) {

    public static ChatDto of(int chatSeq, int chatDelNy, int cuMember, String chatCreateDate, int ifmmSeq, String ifmmId, String path, String uuidName, String shValue) {
        return new ChatDto(chatSeq, chatDelNy, cuMember, chatCreateDate, ifmmSeq, ifmmId, path, uuidName, shValue);
    }
}
