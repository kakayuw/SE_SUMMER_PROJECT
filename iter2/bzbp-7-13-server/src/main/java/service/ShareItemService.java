package service;

import java.util.List;

import model.ShareItem;
import model.User;

/**
 * 
 * 
 */
public interface ShareItemService {

	public List<ShareItem> getAll();

	public List<ShareItem> getAllbyUid(int uid);
	
	public List<ShareItem> getMyAll(int uid);
	
	public int addShareItem(ShareItem shareItem);

}