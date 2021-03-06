package uz.pdp.market.dto.organization;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.Dto;

@Getter
@Setter
@NoArgsConstructor
public class OrganizationCreateDto implements Dto {
    private String name;
    private String email;
    private String code;
    private String website;

    @Builder
    public OrganizationCreateDto(String name, String email, String code, String website) {
        this.name = name;
        this.email = email;
        this.code = code;
        this.website = website;
    }
}
