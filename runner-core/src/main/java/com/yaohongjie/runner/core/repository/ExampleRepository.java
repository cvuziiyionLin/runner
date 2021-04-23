package com.yaohongjie.runner.core.repository;

import com.yaohongjie.runner.core.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 数据访问借口
 */
public interface ExampleRepository extends JpaRepository<Example, Long> {
}

