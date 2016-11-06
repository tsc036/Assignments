package grail;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import util.annotations.Tags;
import util.models.PropertyListenerRegisterer;
@Tags({"InheritedBridgeScenePainter"})
public class InheritingBridgeScenePainter extends Component implements PropertyChangeListener
{
	
    BasicStroke dotted = new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 
            5f, new float[] {2f}, 0f);
    public InheritingBridgeScenePainter()
    {
    	SingletonsCreator.bridgeSceneFactory().getArthur().getHead().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getBody().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getArms().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getArms().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getLegs().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getLegs().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getStringShape().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getHead().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getBody().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getArms().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getArms().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getLegs().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getLegs().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getStringShape().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getHead().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getBody().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getArms().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getArms().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getLegs().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getLegs().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getStringShape().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getHead().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getBody().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getArms().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getArms().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getLegs().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getLegs().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getStringShape().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getHead().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getBody().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getArms().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getArms().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getLegs().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getLegs().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getStringShape().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGorge().getBridgeLeftSide().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGorge().getBridgeRightSide().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGorge().getLeftSide().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGorge().getRightSide().addPropertyChangeListener(this);
    }
    public void paint(Graphics g)
    {
    	super.paint(g);
    	Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(dotted);
        g.setColor(Color.BLACK);     
        draw(g2, SingletonsCreator.bridgeSceneFactory());
    }
    public void draw(Graphics2D g, BridgeInterface bridge) 
    {
    	draw(g, bridge.getArthur());
    	draw(g, bridge.getGalahad());
    	draw(g, bridge.getGuard());
    	draw(g, bridge.getLancelot());
    	draw(g, bridge.getRobin());
    	draw(g,bridge.getGorge());
    	draw(g,bridge.getKnightArea());
    	draw(g,bridge.getGuardArea());
    }
    public void draw(Graphics2D g,AvatarInterface a)
    {
    	g.drawString(a.getStringShape().getText(), a.getStringShape().getX(), a.getStringShape().getY());
    	g.drawLine(a.getArms().getLeftLine().getX(),a.getArms().getLeftLine().getY(), a.getArms().getLeftLine().getX()+a.getArms().getLeftLine().getWidth(),a.getArms().getLeftLine().getY()+a.getArms().getLeftLine().getHeight());
    	g.drawLine(a.getArms().getRightLine().getX(),a.getArms().getRightLine().getY(), a.getArms().getRightLine().getX()+a.getArms().getRightLine().getWidth(),a.getArms().getRightLine().getY()+a.getArms().getRightLine().getHeight());
    	g.drawLine(a.getLegs().getLeftLine().getX(),a.getLegs().getLeftLine().getY(), a.getLegs().getLeftLine().getX()+a.getLegs().getLeftLine().getWidth(),a.getLegs().getLeftLine().getY()+a.getLegs().getLeftLine().getHeight());
    	g.drawLine(a.getLegs().getRightLine().getX(),a.getLegs().getRightLine().getY(), a.getLegs().getRightLine().getX()+a.getLegs().getRightLine().getWidth(),a.getLegs().getRightLine().getY()+a.getLegs().getRightLine().getHeight());
    	g.drawLine(a.getBody().getX(),a.getBody().getY(),a.getBody().getX()+a.getBody().getWidth(),a.getBody().getY()+a.getBody().getHeight());
    	g.drawImage(Toolkit.getDefaultToolkit().getImage(a.getHead().getImageFileName()),a.getHead().getX(),a.getHead().getY(),a.getHead().getWidth(),a.getHead().getHeight(),this);
    }
    public void draw(Graphics2D g,StandingAreaInterface s)
    {
    	g.drawOval(s.getX(), s.getY(), s.getWidth(),s.getHeight());
    }
    public void draw(Graphics2D g, GorgeInterface gorge)
    {
    	g.drawLine(gorge.getLeftSide().getX(), gorge.getLeftSide().getY(), gorge.getLeftSide().getX()+gorge.getLeftSide().getWidth(), gorge.getLeftSide().getX()+gorge.getLeftSide().getHeight());
    	g.drawLine(gorge.getRightSide().getX(), gorge.getRightSide().getY(), gorge.getRightSide().getX()+gorge.getRightSide().getWidth(), gorge.getRightSide().getX()+gorge.getRightSide().getHeight());
    	g.drawLine(gorge.getBridgeLeftSide().getX(), gorge.getBridgeLeftSide().getY(), gorge.getBridgeLeftSide().getX()+gorge.getBridgeLeftSide().getWidth(), gorge.getBridgeLeftSide().getY()-gorge.getBridgeLeftSide().getHeight());
    	g.drawLine(gorge.getBridgeRightSide().getX(), gorge.getBridgeRightSide().getY(), gorge.getBridgeRightSide().getX()+gorge.getBridgeRightSide().getWidth(), gorge.getBridgeRightSide().getY()+gorge.getBridgeRightSide().getHeight());
    }
    public void propertyChange(PropertyChangeEvent arg0)
    {
		repaint();
	}
	
	public void register (PropertyListenerRegisterer aPropertyChangeRegister)
	{
		aPropertyChangeRegister.addPropertyChangeListener(this);        
	}
}
