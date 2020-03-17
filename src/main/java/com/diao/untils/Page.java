package com.diao.untils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Page {
    private Integer currentPage;
    private Integer total;
    private Integer pageSize;
    private Integer pageCount;

    public Page( Integer total) {

        this.total = total;
        this.pageSize = 10;
        if (total%10==0){
            this.pageCount = this.total/10;
        }else {
            this.pageCount = this.total/10 + 1;
        }
    }
}
