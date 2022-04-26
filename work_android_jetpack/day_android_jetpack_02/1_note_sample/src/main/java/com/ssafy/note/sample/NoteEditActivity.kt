package com.ssafy.note.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.ssafy.note.sample.database.NotesDto
import com.ssafy.note.sample.repository.NoteRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

const val KEY_ROWID = "_id"
class NoteEditActivity : AppCompatActivity() {

    private lateinit var mTitleText: EditText
    private lateinit var mBodyText: EditText
    private var mRowId: Long = -1L
    private lateinit var noteRepository: NoteRepository


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_edit)

        noteRepository  = NoteRepository.get()
        mRowId = savedInstanceState?.getLong(KEY_ROWID) ?: -1L

        // -1 이면 앞 Activity에서 넘어온 경우이므로, intent에서 값을 꺼내서, 있으면 수정. 입력:-1
        if (mRowId == -1L) {
            val extras = intent.extras
            mRowId = extras?.getLong(KEY_ROWID) ?: -1L
        }

        findViewById<Button>(R.id.confirm).setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
    }

    private suspend fun initView() {
        mTitleText = findViewById<View>(R.id.title) as EditText
        mBodyText = findViewById<View>(R.id.body) as EditText

        if (mRowId != -1L) {
            var note = NotesDto()
            val job = CoroutineScope(Dispatchers.IO).launch {
                note = noteRepository.getNote(mRowId)
            }
            job.join()
            mTitleText.setText(note.TITLE)
            mBodyText.setText(note.BODY)
        }
    }

    // 비정상 종료시는 id를 기록한다.
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putLong(KEY_ROWID, mRowId)
    }

    // pause에서 저장하도록 구현
    override fun onPause() {
        super.onPause()
        saveState()
    }

    override fun onResume() {
        super.onResume()
        CoroutineScope(Dispatchers.Main).launch {
            initView()
        }
    }

    // -1은 앞 Activity에서 입력으로 넘어온 경우
    private fun saveState() {
        val title = mTitleText.text.toString()
        val body = mBodyText.text.toString()
        if (mRowId == -1L) {
            CoroutineScope(Dispatchers.IO).launch{
                noteRepository.insertNote(NotesDto(title,body))
            }

        } else {
            CoroutineScope(Dispatchers.IO).launch{
                noteRepository.updateNote(NotesDto(mRowId,title,body))
            }
        }
    }
}