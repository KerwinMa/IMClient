package com.jersuen.im.ui.adapter;

import android.widget.SimpleCursorAdapter;
import com.jersuen.im.IM;
import com.jersuen.im.R;
import com.jersuen.im.provider.ContactProvider;

/**
 * 联系人适配器
 * @author JerSuen
 */
public class ContactAdapter extends SimpleCursorAdapter {

    public ContactAdapter() {
        super(
                IM.im,
                R.layout.fragment_contact_list_item,
                IM.im.getContentResolver().query(ContactProvider.CONTACT_URI,null,null,null,null),
                new String[]{ContactProvider.ContactColumns.NICKNAME},
                new int[]{R.id.fragment_contact_list_item_name},
                FLAG_REGISTER_CONTENT_OBSERVER);
    }
}
