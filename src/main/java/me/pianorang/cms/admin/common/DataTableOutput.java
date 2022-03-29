package me.pianorang.cms.admin.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataTableOutput {
    private Integer draw;
    private Long recordsTotal;
    private Long recordsFiltered;
    private List data;
}
