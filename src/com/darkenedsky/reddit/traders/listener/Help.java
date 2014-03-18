package com.darkenedsky.reddit.traders.listener;

import java.io.IOException;
import java.net.MalformedURLException;

import com.darkenedsky.reddit.traders.RedditTraders;
import com.omrlnr.jreddit.messages.PrivateMessage;

public class Help extends RedditListener {

	public Help(RedditTraders rt) {
		super(rt, "HELP", false);
	}

	/**
	 * Reply to the user with a list of all the bot's publicly available
	 * commands.
	 * 
	 * 
	 * @param msg
	 *            The private message received from the user.
	 * @param tokens
	 *            The individual "words" of the command we are executing
	 * @param sb
	 *            The StringBuffer to write any response text out to the user
	 * 
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws ParseException
	 */
	@Override
	public void process(PrivateMessage pm, String[] tokens, StringBuffer sb) throws Exception {

		sb.append("*RedditTraders Trading Bot version " + config.getVersion() + " by /u/" + config.getAuthor() + "*\n\n*Command Usage*\n\n");
		sb.append("--------------------------------------------------------------\n\n");
		sb.append("HELP: Receive this message. \n\n* Usage: HELP\n\n* Example: HELP\n\n");
		sb.append("MODHELP: Receive a list of commands for moderators only. \n\n* Usage: MODHELP\n\n* Example: MODHELP\n\n");
		sb.append("LOOKUP: Lookup a redditor's trading history. \n\n* Usage: LOOKUP [redditor name]\n\n* Example: LOOKUP RedditTraders\n\n");
		sb.append("TRADE: Initiate a report of a successful trade.\n\n* Usage: TRADE [Redditor's name you traded with] [Trade thread URL] [OPTIONAL: Comments]\n\n* Example: TRADE RedditTraders http://www.reddit.com/r/retrogameswap/comments/178tq4/trade_la_la/ Optional comments go here\n\n");
		sb.append("CONFIRM: Confirm that a trade was successful.\n\n* Usage: CONFIRM [trade id]\n\n* Example: CONFIRM 8675309\n\n");
		sb.append("DISPUTE: Dispute that a trade was successful. *This will notify the mods.*\n\n* Usage: DISPUTE [trade id]\n\n* Example: DISPUTE 8675309\n\n");
		sb.append("TOP20: Get the top 20 traders for a subreddit.\n\n* Usage: TOP20 [subreddit]\n\n* Example: TOP20 retrogameswap\n\n");
		sb.append("ABOUT: Information about the bot's open-source license and authorship.\n\n* Usage: ABOUT\n\n* Example: ABOUT\n\n");
		sb.append("--------------------------------------------------------------\n\n");
		sb.append("Questions? Visit the /r/" + config.getSupportReddit() + " subreddit or message /u/" + config.getAuthor() + ". \n\nPlease note that I only check for new messages every " + config.getSleepSec() + " seconds or so. Please be patient! ;)\n\n\n");
	}

}