package br.com.hoiama.curriculos.main;

import br.com.hoiama.curriculos.model.entity.Aluno;
import br.com.hoiama.curriculos.repository.AlunoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import br.com.hoiama.curriculos.model.entity.Formacao;

@EnableCaching
@EntityScan(basePackageClasses = {Formacao.class})
@EnableJpaRepositories(basePackageClasses = AlunoRepository.class)
@SpringBootApplication (scanBasePackages= {"br.com.hoiama.curriculos"})
public class StartSpring {

	public static void main(String[] args) {
		SpringApplication.run(StartSpring.class, args);
	}
	
	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager();
	}
}
