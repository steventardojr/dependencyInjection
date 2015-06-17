package shuffler;

import com.google.inject.*;

public class ReverseShuffleModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(ShuffleStrategy.class).to(ReverseShuffle.class);
	}
}
