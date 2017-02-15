//package org.hebephrenic;
//
//import org.eclipse.jetty.server.NetworkTrafficServerConnector;
//import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.webapp.WebAppContext;
//
//@Deprecated
//public class WebApp 
//{
//    public static void main( String[] args )
//    {
//    	Server server = new Server();
//    	NetworkTrafficServerConnector connector = new NetworkTrafficServerConnector(server);
//    	connector.setIdleTimeout(30000);
//    	connector.setPort(10086);
//    	connector.setAcceptQueueSize(10);
//    	server.addConnector(connector);
//    	
//    	WebAppContext webAppCtx = new WebAppContext();
//    	webAppCtx.setWar("src/main/webapp");
//    	webAppCtx.setContextPath("/");
//    	server.setHandler(webAppCtx);
//    	
////    	System.setProperty("system.mode", "dev");
//    	
////    	RequestLogHandler reqLogHdl = new RequestLogHandler();
////    	Handler[] handlers = {reqLogHdl, webAppCtx};
//    	
////    	HandlerCollection collection = new HandlerCollection();
////    	collection.setHandlers(handlers);
////    	server.setHandler(collection);
//    	try {
//			server.start();
//			server.join();
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.exit(1);
//		}
//    }
//}
