package shuffler;

import com.google.inject.*;

public class RandomShuffleModule extends AbstractModule {
	@Override
	protected void configure() { 
		bind(ShuffleStrategy.class).to(RandomShuffle.class);
	}
}
