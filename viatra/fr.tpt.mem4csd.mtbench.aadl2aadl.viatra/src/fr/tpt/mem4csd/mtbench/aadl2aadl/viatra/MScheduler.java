package fr.tpt.mem4csd.mtbench.aadl2aadl.viatra;

import org.eclipse.viatra.transformation.evm.api.ScheduledExecution;
import org.eclipse.viatra.transformation.evm.api.Scheduler;

public class MScheduler extends Scheduler {

	private MSchedulerFactory factory;

	protected MScheduler(final ScheduledExecution execution) {
		super(execution);
//        System.out.println("MScheduler");
	}

	protected void schedule() {

		super.schedule();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	public static class MSchedulerFactory implements ISchedulerFactory {

		/**
		 * Creates a scheduler factory for the given provider.
		 * 
		 * @param provider
		 */
		public MSchedulerFactory() {
		}

		@Override
		public Scheduler prepareScheduler(final ScheduledExecution execution) {
			MScheduler scheduler = new MScheduler(execution);
			scheduler.factory = this;
			return scheduler;
		}
	}
}