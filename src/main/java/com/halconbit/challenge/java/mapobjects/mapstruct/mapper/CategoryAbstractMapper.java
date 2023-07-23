import com.halconbit.challenge.java.mapobjects.mapstruct.dto.CategoryDTO;
import com.halconbit.challenge.java.mapobjects.mapstruct.entity.CategoryEntity;

import java.util.List;
import org.mapstruct.InheritInverseConfiguration;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Brayan Esteves
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {})
public abstract class CategoryAbstractMapper {
    
    @Autowired
    private CategoryRepository categoryRepository;
        
   abstract CategoryDTO toGetCategory(CategoryEntity categoryEntity);
    
    /**
     * Map inverse
     */
   
    CategoryEntity toEntity(CategoryDTO categoryDTO) {
        if(categoryDTO == null) {
            return null;
        }
        
        CategoryEntity categoryEntity = this.categoryRepository.findById(categoryDTO.getId()).orElse(null);
        
        if(categoryEntity == null {
            return null;
        }
        
        categoryEntity.setId(categoryDTO.getId());
        categoryEntity.setName(categoryDTO.getName());
        
        return categoryDTO;
    }
    
    abstract List<CategoryDTO> toGetCategoryList(List<CategoryEntity> productList);
    
    abstract List<CategoryEntity> toEntityList(List<CategoryDTO> getCategoryList);
    
}
