package com.example.dto.base;


public enum SexEnum implements BaseEnum<String> {

    // 性别枚举
    SEX_ENUM_01("F", "女"),
    SEX_ENUM_02("M", "男");

    private String code;
    private String name;

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    SexEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(String code) {
        for (SexEnum sexEnum : SexEnum.values()
             ) {
            if (sexEnum.code.equals(code)) {
                return sexEnum.name;
            }
        }
        return null;
    }
}
