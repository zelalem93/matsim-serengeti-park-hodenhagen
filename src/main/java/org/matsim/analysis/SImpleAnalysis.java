package org.matsim.analysis;

import org.matsim.core.events.EventsUtils;

public class SImpleAnalysis {

    public static void main(String[] args) {

        // intialize the new eventhandler

        var handler = new SimplePersonEventHandler();
        var manager = EventsUtils.createEventsManager();

        manager.addHandler(handler);
        EventsUtils.readEvents(manager, "C:\\Users\\zelalemb\\Documents\\MOST\\PHD\\Matsim\\matsim tutorial\\matsim-serengeti-park-hodenhagen\\scenarios\\serengeti-park-v1.0\\output\\output-serengeti-park-v1.0-run1\\serengeti-park-v1.0-run1.output_events.xml.gz" );
    }
}
