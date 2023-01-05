package com.tasteZip.infra.modules.dto;

public record ChartDto(
        String chartSeq,
        String ifmmSeq
) {

    public static chartDto of(String chartSeq, String ifmmSeq) {
        return new ChartDto(chartSeq, ifmmSeq);
    }
}
