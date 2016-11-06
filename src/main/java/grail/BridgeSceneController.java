package grail;
import util.annotations.Tags;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.event.KeyEvent;
@Tags({"BridgeSceneController"})
public class BridgeSceneController extends Component implements BridgeSceneControllerInterface 
{
	private InheritingBridgeScenePainter scene;
	private int mouseClickX,mouseClickY;
	public BridgeSceneController(InheritingBridgeScenePainter s)
	{
		scene=s;
		scene.addMouseListener(this);
		scene.addKeyListener(this);
		scene.setFocusable(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		mouseClickX=e.getX();
		mouseClickY=e.getY();
		//SingletonsCreator.bridgeSceneFactory().getArthur().move(mouseClickX-SingletonsCreator.bridgeSceneFactory().getArthur().getHead().getX(), mouseClickY-SingletonsCreator.bridgeSceneFactory().getArthur().getHead().getY());
		
	}
	
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void keyTyped(KeyEvent e) 
	{
		if(e.getKeyChar()=='a')
		{
			SingletonsCreator.bridgeSceneFactory().getArthur().move(mouseClickX-SingletonsCreator.bridgeSceneFactory().getArthur().getHead().getX(), mouseClickY-SingletonsCreator.bridgeSceneFactory().getArthur().getHead().getY());
		}
		else if(e.getKeyChar()=='g')
		{
			SingletonsCreator.bridgeSceneFactory().getGalahad().move(mouseClickX-SingletonsCreator.bridgeSceneFactory().getGalahad().getHead().getX(), mouseClickY-SingletonsCreator.bridgeSceneFactory().getGalahad().getHead().getY());
		}
		else if(e.getKeyChar()=='l')
		{
			SingletonsCreator.bridgeSceneFactory().getLancelot().move(mouseClickX-SingletonsCreator.bridgeSceneFactory().getLancelot().getHead().getX(), mouseClickY-SingletonsCreator.bridgeSceneFactory().getLancelot().getHead().getY());
		}
		else if(e.getKeyChar()=='r')
		{
			SingletonsCreator.bridgeSceneFactory().getRobin().move(mouseClickX-SingletonsCreator.bridgeSceneFactory().getRobin().getHead().getX(), mouseClickX-SingletonsCreator.bridgeSceneFactory().getRobin().getHead().getY());
		}
		else if(e.getKeyChar()=='o')
		{
			SingletonsCreator.bridgeSceneFactory().backToStart();
		}
	}
}
