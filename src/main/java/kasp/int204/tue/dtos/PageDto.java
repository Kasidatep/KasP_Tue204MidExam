package kasp.int204.tue.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class PageDto<T> {
    private List<T> content;
    private boolean first;
    private boolean last;
    private Integer totalPages;
    private Integer totalElements;
    private Integer size;

}
