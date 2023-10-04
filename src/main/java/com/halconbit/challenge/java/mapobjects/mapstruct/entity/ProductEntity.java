import com.halconbit.challenge.java.mapobjects.mapstruct.dto.CategoryDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 *
 * @author brayan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class ProductEntity {
    
    @Id
    private long                    id;

    private String                name;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryDTO    categoryDto;
    
}
