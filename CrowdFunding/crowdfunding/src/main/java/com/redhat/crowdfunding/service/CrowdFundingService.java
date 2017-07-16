package com.redhat.crowdfunding.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.redhat.crowdfunding.bean.Fund;

/**
 * @author littleredhat
 */
public interface CrowdFundingService {

	// ��ȡ����
	public int getFundCount() throws InterruptedException, ExecutionException;

	// �ڳ��б�
	public List<Fund> getFunds(int pageIndex) throws InterruptedException, ExecutionException;

	// �����ڳ�
	public boolean raiseFund() throws InterruptedException, ExecutionException;

	// ���ͽ��
	public boolean sendCoin(String owner, int coin) throws InterruptedException, ExecutionException;
}