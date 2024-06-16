package com.javarush;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;


@Entity
@Table(schema = "world", name = "country")
public class Country {
    @Id
    @Column(name = "id")
    private Integer id;

    private String code;

    @Column(name = "code_2")
    private String alternativeCode;

    private String name;

    @Column(name = "continent")
    @Enumerated(EnumType.ORDINAL)
    private Continent continent;

    private String region;

    @Column(name = "surface_area")
    private BigDecimal surfaceArea;

    @Column(name = "indep_year")
    private Short independenceYear;

    private Integer population;

    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;

    @Column(name = "gnp")
    private BigDecimal GNP;

    @Column(name = "gnpo_id")
    private BigDecimal GNPOId;

    @Column(name = "local_name")
    private String localName;

    @Column(name = "government_form")
    private String governmentForm;

    @Column(name = "head_of_state")
    private String headOfState;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capital")
    private City city;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Set<CountryLanguage> languages;

    public Integer getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getAlternativeCode() {
        return alternativeCode;
    }

    public String getName() {
        return name;
    }

    public Continent getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public Short getIndependenceYear() {
        return independenceYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public BigDecimal getGNP() {
        return GNP;
    }

    public BigDecimal getGNPOId() {
        return GNPOId;
    }

    public String getLocalName() {
        return localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public City getCity() {
        return city;
    }

    public Set<CountryLanguage> getLanguages() {
        return languages;
    }
}
