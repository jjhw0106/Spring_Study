package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member", // 해당 패키지만 탐색한다.
        basePackageClasses = AutoAppConfig.class,
        // 지정하지 않으면, hello.core부터 시작해서 하단의 패키지들을 탐색한다.
        // 추천방법: 프로젝트의 최상단에 설정 파일을 놓는다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
