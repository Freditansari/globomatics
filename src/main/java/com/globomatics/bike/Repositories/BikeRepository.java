package com.globomatics.bike.Repositories;

import com.globomatics.bike.models.bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeRepository extends JpaRepository<bike, Long> {


}
