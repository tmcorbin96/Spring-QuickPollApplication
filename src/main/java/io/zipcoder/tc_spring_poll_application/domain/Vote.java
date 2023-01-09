package io.zipcoder.tc_spring_poll_application.domain;

import javax.persistence.*;

@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Vote_ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    Option options;

    public Option getOptions() {
        return options;
    }

    public void setOptions(Option options) {
        this.options = options;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
