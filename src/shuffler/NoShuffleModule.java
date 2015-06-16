package shuffler;

import com.google.inject.*;

public class NoShuffleModule extends AbstractModule {
	@Override
	protected void configure() { 
		bind(ShuffleStrategy.class).to(NoShuffle.class);
	}
}
