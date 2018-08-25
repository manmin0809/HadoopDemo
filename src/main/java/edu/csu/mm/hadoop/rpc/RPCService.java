package edu.csu.mm.hadoop.rpc;

/**
 * RPC Service
 * 
 * @author ManMin
 * @date   2018年8月25日 下午10:40:15
 *
 */
public interface RPCService {
	
	public static final long versionID = 11100;  //必须指定（版本ID）
	public String sayHi(String name);
}
