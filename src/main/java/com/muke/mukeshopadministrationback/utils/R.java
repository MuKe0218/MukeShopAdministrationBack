package com.muke.mukeshopadministrationback.utils;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class R {
    private Boolean flag;
    private Object data;

    public R(Boolean flag){
        this.flag = flag;
    }
    public R(Boolean flag, Object data){
        this.flag = flag;
        this.data = data;
    }
}
