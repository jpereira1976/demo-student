package uy.edu.um.demo;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Builder
public class StudentSpecification implements Specification<Student> {
    private String firstName;
    private String lastName;

    @Override
    public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        if (firstName != null)
            predicates.add(criteriaBuilder.equal(root.get("firstName"), firstName));
        if (lastName != null)
            predicates.add(criteriaBuilder.equal(root.get("lastName"), lastName));
        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }
}
