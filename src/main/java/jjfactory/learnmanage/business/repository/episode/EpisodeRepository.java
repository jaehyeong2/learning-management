package jjfactory.learnmanage.business.repository.episode;

import jjfactory.learnmanage.business.domain.episode.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<Episode,Long> {
}
