package br.com.casellisoftware.bibbirthdaymanagerapi.domain.enums;

public enum InterestType implements GlobalEnumeration {

    AREAUM(0, "Área um"),
    AREADOIS(1, "Área dois");

    private final Integer code;
    private final String description;

    InterestType(int code, String description){
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public Object getEnum(Integer code) {
        return toEnum(code);
    }

    @Override
    public Object[] allValues() {
        return InterestType.values();
    }

    public static InterestType toEnum(Integer code){
        if(code == null)
            return null;

        for(InterestType type : InterestType.values()) {
            if(type.getCode() == code) {
                return type;
            }
        }

        throw new IllegalArgumentException("Invalid code, code:"+code);
    }
}
