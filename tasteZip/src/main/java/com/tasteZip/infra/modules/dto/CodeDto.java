package com.tasteZip.infra.modules.dto;

public class CodeDto(
        String ifccSeq,
        String ifccAnother,
        String ifccName,
        String ifccNameEng,
        String ifccUseNy,
        String ifccOrder,
        String ifccExplanation,
        String ifccDelNy,
        String ifccReferenceV1,
        String ifccReferenceV2,
        String ifccReferenceV3,
        String ifccReferenceI1,
        String ifccReferenceI2,
        String ifccReferenceI3,
        String ifccCrteatedAt,
        String ifccModifiedAt,
        String ifcgSeq
) {

    public static List<CodeDto> cachedCodeArrayList = new ArrayList<CodeDto>();

    public static  CodeDto of(String ifccSeq, String ifccAnother, String ifccName, String ifccNameEng, String ifccUseNy, String ifccOrder, String ifccExplanation, String ifccDelNy,
                              String ifccReferenceV1, String ifccReferenceV2, String ifccReferenceV3, String ifccReferenceI1, String ifccReferenceI2, String ifccReferenceI3, String ifccCrteatedAt,
                              String ifccModifiedAt, String ifcgSeq) {
        return new CodeDto(ifccSeq, ifccAnother, ifccName, ifccNameEng, ifccUseNy, ifccOrder, ifccExplanation, ifccDelNy, ifccReferenceV1, ifccReferenceV2, ifccReferenceV3, ifccReferenceI1, ifccReferenceI2, ifccReferenceI3,
                ifccCrteatedAt, ifccModifiedAt, ifcgSeq);
    }
}
