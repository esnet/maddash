package net.es.maddash.www.rest;

import javax.ws.rs.Path;

import net.es.maddash.madalert.rest.DiffResource;

/**
 * Grizzly ignores the ApplicationPath annotation, so hack to get right URI path with /maddash
 * @author alake
 *
 */

@Path("/maddash/diff")
public class MaDAlertDiffResource extends DiffResource{

}
